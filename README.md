# ECommerceMSAInJava
ECommerceMSAInJava
Inventory Services
The Inventory microservice (“Inventory”) manages the inventory of a particular store using the concept of bins and bin items.

Bin -  A bin is the container of the products (SKUs) and is always mapped to a store and will be identified using the BinID. While defining a bin, the bin name, description, channel, collection and parent bin (if applicable) need to be provided.
BinItem -  refers the contents (primarily the SKUs) of the bin are to as bin items.  While defining a bin item, the bin ID, SKU ID, ATP quantity, back-ordered quantity, out-of-stock threshold, and low-stock threshold need to be provided.
Transactions - These are the operations that can be performed over a bin item, like adding/removing/transfering/reconsiling the quantities in a bin item

Data Model: 
1 bin(uniquely identified by bin name) has many bin items
each binitem has multiple transactions

API:
bin
GET /bin: Get list of bins
POST /binitems: Create a bin item
GET /binitem/{binID}: Get bin item by ID
PATCH /binitems/: Update bin item

binitems
GET /binitems: Get list of bin items
POST /binitems: Create a bin item
GET /binitem/{binID}: Get bin item by ID
PATCH /binitems/: Update bin item
