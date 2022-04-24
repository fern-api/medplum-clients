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
    as = ImmutableResearchSubject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchSubject {
  Optional<Meta> meta();

  Optional<String> actualArm();

  String resourceType();

  Optional<Reference> consent();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Period> period();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<ResearchsubjectStatus> status();

  Reference individual();

  Optional<String> assignedArm();

  Reference study();

  Optional<id> id();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  static ImmutableResearchSubject.ResourceTypeBuildStage builder() {
    return ImmutableResearchSubject.builder();
  }
}
