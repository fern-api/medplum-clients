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

  Optional<String> subscriberId();

  Optional<Reference> subscriber();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> relationship();

  Optional<PositiveInt> order();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<String> dependent();

  Optional<Id> id();

  List<Reference> payor();

  String resourceType();

  Optional<Reference> policyHolder();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Period> period();

  Reference beneficiary();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<String> network();

  @JsonProperty("class")
  Optional<List<Coverage_Class>> _class();

  Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  Optional<List<Reference>> contract();

  static ImmutableCoverage.ResourceTypeBuildStage builder() {
    return ImmutableCoverage.builder();
  }
}
