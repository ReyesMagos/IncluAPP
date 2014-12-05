/**
* Experiencia.js
*
* @description :: TODO: You might write a short summary of how this model works and what it represents here.
* @docs        :: http://sailsjs.org/#!documentation/models
*/

module.exports = {

  attributes: {
    title: {
        type: 'String',
        required: true

    },
    description: {
        type: 'String',
        required: true

    },
    depto: {
        type: 'String',
        required: true

    },
    city: {
        type: 'String',
        required: true

    },
    address: {
        type: 'String',
        required: true
    },
    state: {
        type: 'boolean',
        required: true
    }, user:{
    	model:'user'
    }
  }
};

