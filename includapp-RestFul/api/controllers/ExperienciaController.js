/**
 * ExperienciaController
 *
 * @description :: Server-side logic for managing experiencias
 * @help        :: See http://links.sailsjs.org/docs/controllers
 */

module.exports = {

    title: {
        type: 'String',
        required: true

    },
    description: {
        type: 'String',
        required: true

    }
    depto: {
        type: 'String',
        required: true

    },
    city: {
        type: 'String',
        required: true

    }
    address: {
        type: 'String',
        required: true
    },
    state: {
        type: 'boolean',
        required: true
    }
};