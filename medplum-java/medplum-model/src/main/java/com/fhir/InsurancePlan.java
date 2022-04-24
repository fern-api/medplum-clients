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
    as = ImmutableInsurancePlan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan {
  Optional<code> language();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Period> period();

  Optional<Reference> administeredBy();

  String resourceType();

  Optional<List<Reference>> coverageArea();

  Optional<List<InsurancePlan_Coverage>> coverage();

  Optional<Reference> ownedBy();

  Optional<List<Reference>> network();

  Optional<InsuranceplanStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<InsurancePlan_Plan>> plan();

  Optional<List<InsurancePlan_Contact>> contact();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<String>> alias();

  Optional<List<Reference>> endpoint();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<id> id();

  Optional<List<CodeableConcept>> type();

  static ImmutableInsurancePlan.ResourceTypeBuildStage builder() {
    return ImmutableInsurancePlan.builder();
  }
}
