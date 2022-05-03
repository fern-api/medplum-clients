package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage {
  Optional<Boolean> subrogation();

  Optional<Uri> implicitRules();

  @JsonProperty("class")
  Optional<List<Coverage_Class>> _class();

  Optional<String> network();

  Optional<String> subscriberId();

  List<Reference> payor();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Period> period();

  Optional<Meta> meta();

  Optional<CodeableConcept> type();

  Optional<Code> status();

  Optional<Reference> policyHolder();

  Optional<String> dependent();

  String resourceType();

  Optional<PositiveInt> order();

  Optional<CodeableConcept> relationship();

  Optional<List<Extension>> extension();

  Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary();

  Optional<Narrative> text();

  Reference beneficiary();

  Optional<List<Reference>> contract();

  Optional<Code> language();

  Optional<Reference> subscriber();

  static ImmutableCoverage.ResourceTypeBuildStage builder() {
    return ImmutableCoverage.builder();
  }
}
