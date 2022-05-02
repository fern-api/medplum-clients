package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBinary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Binary {
  Optional<Reference> securityContext();

  Optional<Code> contentType();

  Optional<Meta> meta();

  String resourceType();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Base64Binary> data();

  static ImmutableBinary.ResourceTypeBuildStage builder() {
    return ImmutableBinary.builder();
  }
}
