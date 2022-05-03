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
  Optional<Markdown> purpose();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<ValueSet_Expansion> expansion();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<String> title();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<List<Identifier>> identifier();

  Optional<ValueSet_Compose> compose();

  Optional<Boolean> immutable();

  Optional<ValuesetStatus> status();

  Optional<Markdown> description();

  Optional<Id> id();

  Optional<Uri> url();

  Optional<String> name();

  Optional<String> publisher();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  static ImmutableValueSet.ResourceTypeBuildStage builder() {
    return ImmutableValueSet.builder();
  }
}
