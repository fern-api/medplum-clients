#!/usr/bin/env sh

set -e

npx --yes fern-api@0.0.14 generate api api/generated/ir.json

# Generate Java SDK
# Will eventually be packaged in an easy-to-use CLI
cd medplum-java 
./codegen.sh