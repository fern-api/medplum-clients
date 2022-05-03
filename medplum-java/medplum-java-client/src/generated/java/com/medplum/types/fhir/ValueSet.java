package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    as = ImmutableValueSet.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet {
  Optional<ValueSet_Expansion> expansion();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> contact();

  Optional<ValueSet_Compose> compose();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> copyright();

  Optional<Meta> meta();

  Optional<Uri> url();

  Optional<Boolean> immutable();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> purpose();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<String> title();

  Optional<String> publisher();

  Optional<Code> language();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<List<Extension>> extension();

  Optional<ValuesetStatus> status();

  Optional<Markdown> description();

  static ImmutableValueSet.ResourceTypeBuildStage builder() {
    return ImmutableValueSet.builder();
  }
}
