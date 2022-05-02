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
  Optional<String> kty();

  Optional<String> e();

  Optional<String> resourceType();

  Optional<String> d();

  Optional<String> q();

  Optional<Uri> implicitRules();

  Optional<String> alg();

  Optional<String> kid();

  Optional<Code> language();

  Optional<Boolean> active();

  Optional<String> use();

  Optional<List<String>> x5c();

  Optional<Meta> meta();

  Optional<String> dq();

  Optional<List<String>> key_ops();

  Optional<String> dp();

  Optional<Id> id();

  Optional<String> n();

  Optional<String> x5t();

  Optional<String> qi();

  Optional<String> p();

  static ImmutableJsonWebKey.Builder builder() {
    return ImmutableJsonWebKey.builder();
  }
}
