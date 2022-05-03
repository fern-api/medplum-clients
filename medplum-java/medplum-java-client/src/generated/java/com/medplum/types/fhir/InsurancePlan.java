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
  Optional<List<InsurancePlan_Plan>> plan();

  Optional<List<InsurancePlan_Contact>> contact();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<List<Reference>> endpoint();

  Optional<List<Identifier>> identifier();

  Optional<Period> period();

  Optional<List<Reference>> coverageArea();

  Optional<InsuranceplanStatus> status();

  Optional<List<InsurancePlan_Coverage>> coverage();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<String> name();

  String resourceType();

  Optional<List<Reference>> network();

  Optional<Meta> meta();

  Optional<Reference> ownedBy();

  Optional<Code> language();

  Optional<List<CodeableConcept>> type();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> alias();

  Optional<Reference> administeredBy();

  static ImmutableInsurancePlan.ResourceTypeBuildStage builder() {
    return ImmutableInsurancePlan.builder();
  }
}
