#!/usr/bin/env sh

set -e

npx --yes fern-api@0.0.28 generate api api/generated/ir.json
npx --yes fern-typescript@0.0.28 client api/generated/ir.json medplum-typescript

# Generate Java SDK
# Will eventually be packaged in an easy-to-use CLI
cd medplum-java
./codegen.sh
