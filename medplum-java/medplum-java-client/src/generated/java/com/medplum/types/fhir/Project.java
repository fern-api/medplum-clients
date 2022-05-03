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
  Optional<Reference> defaultPatientAccessPolicy();

  String name();

  Optional<String> description();

  Optional<String> resourceType();

  Optional<List<Code>> features();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Reference owner();

  Optional<Code> language();

  static ImmutableProject.NameBuildStage builder() {
    return ImmutableProject.builder();
  }
}
