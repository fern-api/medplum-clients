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
  Optional<Id> id();

  Optional<Period> period();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<CareteamStatus> status();

  Optional<Reference> encounter();

  Optional<List<CareTeam_Participant>> participant();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ContactPoint>> telecom();

  Optional<Uri> implicitRules();

  Optional<Reference> subject();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> category();

  Optional<String> name();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> managingOrganization();

  Optional<List<Reference>> reasonReference();

  static ImmutableCareTeam.ResourceTypeBuildStage builder() {
    return ImmutableCareTeam.builder();
  }
}
