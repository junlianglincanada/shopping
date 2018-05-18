INSERT INTO `t_role` VALUES (1,'ADMIN');
INSERT INTO `t_role` VALUES (2,'REGISTERED');


INSERT INTO `t_vendor` (id,name,description,create_date) VALUES (1,'APPLE','ELECTRONIC VENDOR',CURDATE());
INSERT INTO `t_vendor` (id,name,description,create_date) VALUES (2,'HP','PRINTERS',CURDATE());
INSERT INTO `t_vendor` (id,name,description,create_date) VALUES (3,'IKEA','FURNITURE',CURDATE());
INSERT INTO `t_vendor` (id,name,description,create_date) VALUES (4,'CANADIAN TIRE','ALL SORTS OF PARTS',CURDATE());

INSERT INTO `t_catagory` (id,name,parent_id) VALUES
 (1,'Electronic',0),
(2,'Clothing',0),
(3,'Furniture',0),
(4,'Parts',0),
(5,'Toys',0);

INSERT iNTO `t_product` (name,price,catagory_id,user_id,vendor_id) VALUES
('Macbook Pro 2013 13',1588,1,1,1),
('Macbook Air 2015 13',1000,1,1,1),
('iMac Pro 2013 13',1288,1,1,1),
('iMac mini 2013 13',1088,1,1,1),
('Photo All In One',498,1,1,2),
('HP Sprocket Plus Printer',568,1,1,2),
('HP Color LaserJet Pro M254dw',359,1,1,2),
('HP Color LaserJet Pro MFP M281fdw',429,1,1,2),
('HP EliteBook 840 G5 Notebook PC',2379,1,1,2),
('HP ProBook 440 G5 Notebook PC',1319,1,1,2),
('HP ProBook 440 G5 Notebook PC',1319,1,1,2),
('HP Z240 Tower Workstation',1670,1,1,2),
('HP ZBook Studio G4 Mobile Workstation',2599,1,1,2),
('ALEX',149,2,1,3),
('LINNMON / ALEX',120,2,1,3),
('BYLLAN',17,3,1,3),
('INGATORP',149,3,1,3),
('MALM',179,3,1,3),
('BRUSALI',80,3,1,3),
('For Living Essex Grill Gazebo ',500,4,1,4),
('Yardistry Arched Roof Pergola Kit, 12 x 12-ft ',1700,4,1,4);