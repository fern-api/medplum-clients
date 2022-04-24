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
    as = ImmutableCareTeam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CareTeam {
  Optional<Reference> subject();

  String resourceType();

  Optional<id> id();

  Optional<List<CareTeam_Participant>> participant();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> managingOrganization();

  Optional<uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> encounter();

  Optional<List<Identifier>> identifier();

  Optional<Period> period();

  Optional<List<CodeableConcept>> category();

  Optional<CareteamStatus> status();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> telecom();

  static ImmutableCareTeam.ResourceTypeBuildStage builder() {
    return ImmutableCareTeam.builder();
  }
}
