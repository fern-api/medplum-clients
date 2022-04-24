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
    as = ImmutableAccount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Account {
  Optional<AccountStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<List<Account_Guarantor>> guarantor();

  Optional<Reference> owner();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<Reference> partOf();

  Optional<Period> servicePeriod();

  Optional<uri> implicitRules();

  String resourceType();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> subject();

  Optional<code> language();

  Optional<List<Account_Coverage>> coverage();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  static ImmutableAccount.ResourceTypeBuildStage builder() {
    return ImmutableAccount.builder();
  }
}
