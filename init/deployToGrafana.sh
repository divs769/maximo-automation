#!/bin/bash
curl -i -H "Content-Type: Application/json" -H "Authorization: Bearer eyJrIjoienF4UGhSVzMzZzQ5SXBSdnV4RlVNZzJrYU0yWjc5aDEiLCJuIjoiTElBTSIsImlkIjoyfQ==" -X POST http://34.249.229.63:3000/api/dashboards/db -d @Dashboard.json
