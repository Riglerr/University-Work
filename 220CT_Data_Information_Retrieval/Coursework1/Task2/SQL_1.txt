CREATE TABLE Purchase_Order( purchase_order_no NUMBER(3) PRIMARY KEY ,
							airline_code CHAR(4) FOREIGN KEY REFERENCES Aircraft(aircraft_code),
							date DATE NOT NULL
							 );
							
CREATE TABLE Aircraft(aircraft_code VARCHAR2(5) PRIMARY KEY,
						aircraft_type VARCHAR(30) NOT NULL,
						aircraft_price NUMBER(11,2) NOT NULL,
						);
						
CREATE TABLE Airline( airline_code CHAR(4) PRIMARY KEY,
						airline_name VARCHAR(20) NOT NULL,
						airline_address VARCHAR(50) NOT NULL,
						airline_city VARCHAR(15) NOT NULL,
						airline_country VARCHAR(15) NOT NULL);
					
CREATE TABLE Order_Aircraft(purchase_order_no NUMBER(3) PRIMARY KEY,
							aircraft_code CHAR(4) PRIMARY KEY,
							aircraft_quantity NUMBER(3) NOT NULL,
							CONSTRAINT fk_ac_Oa FOREIGN KEY (aircraft_code) REFERENCES Aircraft(aircraft_code),
							CONSTRAINT fk_po_Oa FOREIGN KEY (purchase_order_no) REFERENCES Purchase_Order(purchase_order_no));
								
								