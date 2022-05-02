package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProjectMembership.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProjectMembership {
  Optional<Reference> accessPolicy();

  Optional<Meta> meta();

  Optional<Code> language();

  Reference project();

  Reference user();

  Reference profile();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Boolean> admin();

  Optional<String> resourceType();

  Optional<Reference> userConfiguration();

  static ImmutableProjectMembership.ProjectBuildStage builder() {
    return ImmutableProjectMembership.builder();
  }
}
