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
  Optional<Id> id();

  String resourceType();

  Optional<ResearchsubjectStatus> status();

  Optional<String> actualArm();

  Reference study();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Reference individual();

  Optional<String> assignedArm();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Period> period();

  Optional<Reference> consent();

  Optional<List<Identifier>> identifier();

  static ImmutableResearchSubject.ResourceTypeBuildStage builder() {
    return ImmutableResearchSubject.builder();
  }
}
