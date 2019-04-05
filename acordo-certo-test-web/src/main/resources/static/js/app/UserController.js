'use strict';

angular.module('crudApp').controller('UserController',
    ['UserService', '$scope',  function( UserService, $scope) {

        var self = this;
        self.usuario = {};
        self.users=[];

        self.submit = submit;
        self.getAllUsers = getAllUsers;
        self.createUser = createUser;
        self.removeUser = removeUser;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting');
            if (self.usuario.id === undefined || self.usuario.id === null) {
                console.log('Saving New User', self.usuario);
                createUser(self.usuario);
            } else {
                updateUser(self.usuario, self.usuario.id);
                console.log('User updated with id ', self.usuario.id);
            }
        }

        function createUser(user) {
            console.log('About to create user');
            UserService.createUser(user)
                .then(
                    function (response) {
                        self.successMessage = 'Usuário criado com sucesso';
                        self.errorMessage='';
                        self.done = true;
                        self.usuario={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        self.errorMessage = 'Erro ao criar usuário: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }

        function removeUser(id){
            UserService.removeUser(id)
                .then(
                    function(){
                    },
                    function(errResponse){
                    }
                );
        }


        function getAllUsers(){
            return UserService.getAllUsers();
        }

        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.usuario={};
            $scope.myForm.$setPristine();
        }
    }


    ]);