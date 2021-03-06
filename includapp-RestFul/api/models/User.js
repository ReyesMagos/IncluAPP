/**
 * User.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/#!documentation/models
 */

module.exports = {

    attributes: {
        name: {
            type: 'string',
            required: true
        },
        lastname: {
            type: 'string',
            required: true
        },
        age: {
            type: 'string',
            required: true
        },
        profession: {
            type: 'string',
            required: true
        },
        experiencias: {
            collection: 'experiencia',
            via: 'user'
        }
    }
};