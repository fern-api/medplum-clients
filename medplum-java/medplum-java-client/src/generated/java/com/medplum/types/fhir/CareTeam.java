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
  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> reasonReference();

  Optional<String> name();

  Optional<List<CareTeam_Participant>> participant();

  Optional<List<ContactPoint>> telecom();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Annotation>> note();

  Optional<CareteamStatus> status();

  String resourceType();

  Optional<Reference> subject();

  Optional<List<Reference>> managingOrganization();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Period> period();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> reasonCode();

  static ImmutableCareTeam.ResourceTypeBuildStage builder() {
    return ImmutableCareTeam.builder();
  }
}
