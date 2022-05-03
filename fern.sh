#!/usr/bin/env sh

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
cd $SCRIPT_DIR

npx --yes fern-api@0.0.35 generate api api/generated/ir.json
npx --yes fern-typescript@0.0.35 client api/generated/ir.json medplum-typescript/packages/sdk/src

# Generate Java SDK
# Will eventually be packaged in an easy-to-use CLI
cd medplum-java
./codegen.sh
