package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableJsonWebKey.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface JsonWebKey {
  Optional<String> kid();

  Optional<String> d();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<String>> x5c();

  Optional<String> x5t();

  Optional<String> dq();

  Optional<String> resourceType();

  Optional<String> kty();

  Optional<String> e();

  Optional<String> alg();

  Optional<Id> id();

  Optional<List<String>> key_ops();

  Optional<String> q();

  Optional<String> qi();

  Optional<String> dp();

  Optional<Meta> meta();

  Optional<Boolean> active();

  Optional<String> p();

  Optional<String> use();

  Optional<String> n();

  static ImmutableJsonWebKey.Builder builder() {
    return ImmutableJsonWebKey.builder();
  }
}
