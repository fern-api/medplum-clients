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
    as = ImmutableAccount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Account {
  Optional<CodeableConcept> type();

  Optional<Id> id();

  Optional<List<Account_Coverage>> coverage();

  Optional<AccountStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> partOf();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<Meta> meta();

  Optional<List<Account_Guarantor>> guarantor();

  Optional<Uri> implicitRules();

  Optional<Period> servicePeriod();

  String resourceType();

  Optional<List<Reference>> subject();

  Optional<Reference> owner();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  static ImmutableAccount.ResourceTypeBuildStage builder() {
    return ImmutableAccount.builder();
  }
}
