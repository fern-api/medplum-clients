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
  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<List<Account_Guarantor>> guarantor();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<Account_Coverage>> coverage();

  String resourceType();

  Optional<Reference> owner();

  Optional<Id> id();

  Optional<Reference> partOf();

  Optional<Period> servicePeriod();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Reference>> subject();

  Optional<AccountStatus> status();

  Optional<String> description();

  static ImmutableAccount.ResourceTypeBuildStage builder() {
    return ImmutableAccount.builder();
  }
}
