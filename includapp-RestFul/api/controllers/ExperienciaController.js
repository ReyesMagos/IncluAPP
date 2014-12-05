/**
 * ExperienciaController
 *
 * @description :: Server-side logic for managing experiencias
 * @help        :: See http://links.sailsjs.org/docs/controllers
 */
module.exports = {
    new: function(req, res) {
        // body...
        res.view();
    },
    create: function(req, res, next) {
        var experiencia = {
            title: req.param('title'),
            description: req.param('description'),
            depto: req.param('depto'),
            city: req.param('city'),
            address: req.param('address'),
            state: req.param('state')
        }
        Experiencia.create(experiencia, function(err, experience) {
                // body...
                if (err)
                    return next(err);
                res.redirect('experiencia/show/'
                    +experience.id);
		});
// body...
	}, 	show:function (req,res,next) {
		Experiencia.findOne(req.param('id'), function experienceFounded (err, experience) {
			if(err)
			return next(err);
			res.view({
				experience:experience
			});
// body...
		});
	}
};