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
			console.log("culo: ::: "+ experience)
			res.view({
				experience:experience
			});
// body...
		});
	}, index:function (req, res, next) {
		 Experiencia.find(function (err, expiriences) {
		 	if(err)
		 		return next(err);
		 	res.view({
		 		expiriences:expiriences
		 	});
		 	// body...
		 })
		// body...
	},destroy:function (req,res, next) {
		Experiencia.destroy(req.param('id'), function experienceDestroyed (err) {
			if(err)
				return next(err);
			res.redirect('experiencia/index');
			// body...
		})
		// body...
	},edit:function (req, res, next) {
		// body...
			Experiencia.findOne(req.param('id'), function experienceFounded (err, experience) {
			if(err)
			return next(err);
			res.view({
				experience:experience
			});
// body...
		});
	}, update:function  (req, res, next) {
		// body...
		 var experiencia = {
            title: req.param('title'),
            description: req.param('description'),
            depto: req.param('depto'),
            city: req.param('city'),
            address: req.param('address'),
            state: req.param('state')
        }
        Experiencia.update(req.param('id'), experiencia, function experienciaUpdated (err, experience) {
        	if(err)
        		return next(err);
        	// body...
        	console.log(experience);
        	res.redirect('/experiencia/show/'+ req.param('id'));
        });
	}
};