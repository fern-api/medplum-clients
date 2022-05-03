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
  Optional<String> assignedArm();

  Optional<List<Extension>> modifierExtension();

  Optional<ResearchsubjectStatus> status();

  Optional<Reference> consent();

  Optional<String> actualArm();

  Optional<Code> language();

  Optional<Period> period();

  Reference individual();

  String resourceType();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Reference study();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  static ImmutableResearchSubject.IndividualBuildStage builder() {
    return ImmutableResearchSubject.builder();
  }
}
