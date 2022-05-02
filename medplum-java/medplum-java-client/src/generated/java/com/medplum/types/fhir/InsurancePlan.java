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
  Optional<List<InsurancePlan_Contact>> contact();

  Optional<Meta> meta();

  Optional<List<InsurancePlan_Coverage>> coverage();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> coverageArea();

  String resourceType();

  Optional<Code> language();

  Optional<InsuranceplanStatus> status();

  Optional<String> name();

  Optional<Reference> administeredBy();

  Optional<Id> id();

  Optional<List<Reference>> endpoint();

  Optional<List<InsurancePlan_Plan>> plan();

  Optional<Period> period();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> ownedBy();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<String>> alias();

  Optional<List<Reference>> network();

  Optional<List<Identifier>> identifier();

  static ImmutableInsurancePlan.ResourceTypeBuildStage builder() {
    return ImmutableInsurancePlan.builder();
  }
}
