'use strict';
var app = angular.module('my-design', []);

app.config(['$routeProvider',
                   function($routeProvider) {
                     $routeProvider.
                       when('/home', {
                         templateUrl: 'templates/home.html'
                       }).
                       otherwise({
                         redirectTo: '/home'
                       });
                   }]);

app.controller('ProductListCtrl', ['$scope', function($scope) {
	 $scope.products = [
	                    {'name': 'Img 1',
	                      'url':'IMG_1589.JPG'
	                    },
	                    {'name': 'Img 1',
		                      'url':'IMG_1590.JPG'
		                },
		                {'name': 'Img 1',
			              'url':'IMG_1591.JPG'
			            }
	                  ];
	                }]);