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
  Optional<Reference> consent();

  Optional<Uri> implicitRules();

  Optional<String> actualArm();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  Optional<ResearchsubjectStatus> status();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Reference study();

  Optional<String> assignedArm();

  Optional<Meta> meta();

  Optional<Code> language();

  Reference individual();

  static ImmutableResearchSubject.ResourceTypeBuildStage builder() {
    return ImmutableResearchSubject.builder();
  }
}
