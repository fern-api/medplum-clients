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
  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  Optional<CareteamStatus> status();

  Optional<Period> period();

  Optional<List<CareTeam_Participant>> participant();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Reference> encounter();

  Optional<Reference> subject();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> managingOrganization();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<ContactPoint>> telecom();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  static ImmutableCareTeam.ResourceTypeBuildStage builder() {
    return ImmutableCareTeam.builder();
  }
}
