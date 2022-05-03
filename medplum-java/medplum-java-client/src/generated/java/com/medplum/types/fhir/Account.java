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
  Optional<Period> servicePeriod();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Account_Guarantor>> guarantor();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<AccountStatus> status();

  Optional<CodeableConcept> type();

  Optional<Reference> owner();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Reference> partOf();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<List<Reference>> subject();

  Optional<List<Account_Coverage>> coverage();

  static ImmutableAccount.ResourceTypeBuildStage builder() {
    return ImmutableAccount.builder();
  }
}
