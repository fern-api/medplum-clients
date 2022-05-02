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
  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<List<Account_Coverage>> coverage();

  Optional<Period> servicePeriod();

  Optional<Reference> partOf();

  Optional<Id> id();

  Optional<List<Reference>> subject();

  Optional<List<Account_Guarantor>> guarantor();

  Optional<AccountStatus> status();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Reference> owner();

  Optional<Code> language();

  static ImmutableAccount.ResourceTypeBuildStage builder() {
    return ImmutableAccount.builder();
  }
}
