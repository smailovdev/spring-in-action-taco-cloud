delete from Ingredient_Ref;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient (id, code, name, type)
values (1 , 'FLTO', 'Flour Tortilla', 'WRAP');

insert into Ingredient (id, code, name, type)
values (2, 'COTO', 'Corn Tortilla', 'WRAP');

insert into Ingredient (id, code, name, type)
values (3, 'GRBF', 'Ground Beef', 'PROTEIN');

insert into Ingredient (id, code, name, type)
values (4, 'CARN', 'Carnitas', 'PROTEIN');

insert into Ingredient (id, code, name, type)
values (5, 'TMTO', 'Diced Tomatoes', 'VEGGIES');

insert into Ingredient (id, code, name, type)
values (6, 'LETC', 'Lettuce', 'VEGGIES');

insert into Ingredient (id, code, name, type)
values (7, 'CHED', 'Cheddar', 'CHEESE');

insert into Ingredient (id, code, name, type)
values (8, 'JACK', 'Monterrey Jack', 'CHEESE');

insert into Ingredient (id, code, name, type)
values (9, 'SLSA', 'Salsa', 'SAUCE');

insert into Ingredient (id, code, name, type)
values (10, 'SRCR', 'Sour Cream', 'SAUCE');