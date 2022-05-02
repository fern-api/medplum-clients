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
  Optional<List<Identifier>> identifier();

  Optional<ValueSet_Expansion> expansion();

  Optional<String> name();

  Optional<Boolean> experimental();

  Optional<Markdown> copyright();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<String> version();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<Boolean> immutable();

  Optional<Uri> url();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Code> language();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<Markdown> purpose();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<ValueSet_Compose> compose();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<ValuesetStatus> status();

  Optional<Id> id();

  Optional<Markdown> description();

  Optional<List<ResourceList>> contained();

  static ImmutableValueSet.ResourceTypeBuildStage builder() {
    return ImmutableValueSet.builder();
  }
}
