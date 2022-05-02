package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> resourceType();

  Optional<List<AccessPolicy_Resource>> resource();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<Reference> compartment();

  static ImmutableAccessPolicy.Builder builder() {
    return ImmutableAccessPolicy.builder();
  }
}
