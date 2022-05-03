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

  Optional<List<UsageContext>> useContext();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<String> name();

  Optional<Meta> meta();

  Optional<ValueSet_Expansion> expansion();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<ValueSet_Compose> compose();

  Optional<String> publisher();

  Optional<Markdown> purpose();

  Optional<ValuesetStatus> status();

  Optional<Boolean> experimental();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<String> title();

  Optional<String> version();

  Optional<Uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<Boolean> immutable();

  Optional<Narrative> text();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<Id> id();

  static ImmutableValueSet.ResourceTypeBuildStage builder() {
    return ImmutableValueSet.builder();
  }
}
