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
    as = ImmutableProject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Project {
  Optional<String> resourceType();

  Optional<Id> id();

  Reference owner();

  Optional<List<Code>> features();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  String name();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<Reference> defaultPatientAccessPolicy();

  static ImmutableProject.OwnerBuildStage builder() {
    return ImmutableProject.builder();
  }
}
