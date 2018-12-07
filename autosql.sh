#!/bin/bash

sudo -u postgres -i psql << EOF

\i create_table.sql
\i insert_values.sql

\i create_table_td2.sql

\d emp;

\q

exit
EOF
