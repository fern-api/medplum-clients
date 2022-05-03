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
    as = ImmutableInsurancePlan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan {
  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<List<Reference>> coverageArea();

  Optional<List<CodeableConcept>> type();

  Optional<List<Reference>> network();

  Optional<Reference> ownedBy();

  Optional<List<InsurancePlan_Plan>> plan();

  Optional<Code> language();

  Optional<Period> period();

  Optional<Reference> administeredBy();

  Optional<List<String>> alias();

  Optional<InsuranceplanStatus> status();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<InsurancePlan_Contact>> contact();

  String resourceType();

  Optional<List<Reference>> endpoint();

  Optional<List<InsurancePlan_Coverage>> coverage();

  static ImmutableInsurancePlan.ResourceTypeBuildStage builder() {
    return ImmutableInsurancePlan.builder();
  }
}
