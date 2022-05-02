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
  Optional<List<String>> key_ops();

  Optional<String> x5t();

  Optional<String> qi();

  Optional<String> resourceType();

  Optional<List<String>> x5c();

  Optional<String> n();

  Optional<Code> language();

  Optional<String> kty();

  Optional<String> dp();

  Optional<Meta> meta();

  Optional<String> use();

  Optional<Boolean> active();

  Optional<String> p();

  Optional<String> q();

  Optional<Id> id();

  Optional<String> d();

  Optional<String> alg();

  Optional<String> kid();

  Optional<String> e();

  Optional<String> dq();

  Optional<Uri> implicitRules();

  static ImmutableJsonWebKey.Builder builder() {
    return ImmutableJsonWebKey.builder();
  }
}
