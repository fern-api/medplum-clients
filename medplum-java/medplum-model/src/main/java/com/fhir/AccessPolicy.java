package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAccessPolicy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AccessPolicy {
  Optional<code> language();

  Optional<String> resourceType();

  Optional<Reference> compartment();

  Optional<String> name();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<List<AccessPolicy_Resource>> resource();

  static ImmutableAccessPolicy.Builder builder() {
    return ImmutableAccessPolicy.builder();
  }
}
