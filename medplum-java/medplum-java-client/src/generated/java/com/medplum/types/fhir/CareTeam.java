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
    as = ImmutableCareTeam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CareTeam {
  Optional<Reference> subject();

  Optional<List<CareTeam_Participant>> participant();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> encounter();

  Optional<List<Reference>> managingOrganization();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> category();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CareteamStatus> status();

  Optional<Period> period();

  String resourceType();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ContactPoint>> telecom();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  static ImmutableCareTeam.ResourceTypeBuildStage builder() {
    return ImmutableCareTeam.builder();
  }
}
