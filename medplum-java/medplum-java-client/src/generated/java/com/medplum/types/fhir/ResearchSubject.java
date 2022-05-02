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
    as = ImmutableResearchSubject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchSubject {
  Optional<ResearchsubjectStatus> status();

  Optional<String> assignedArm();

  Optional<Meta> meta();

  Optional<Code> language();

  String resourceType();

  Optional<Narrative> text();

  Reference study();

  Optional<String> actualArm();

  Optional<List<ResourceList>> contained();

  Reference individual();

  Optional<Period> period();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Reference> consent();

  static ImmutableResearchSubject.ResourceTypeBuildStage builder() {
    return ImmutableResearchSubject.builder();
  }
}
