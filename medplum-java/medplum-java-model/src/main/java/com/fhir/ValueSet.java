package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<code> language();

  Optional<uri> url();

  Optional<uri> implicitRules();

  Optional<dateTime> date();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<Meta> meta();

  Optional<markdown> copyright();

  Optional<ValueSet_Compose> compose();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<String> title();

  Optional<ValuesetStatus> status();

  Optional<Narrative> text();

  Optional<ValueSet_Expansion> expansion();

  Optional<String> publisher();

  Optional<Boolean> experimental();

  Optional<String> name();

  Optional<markdown> description();

  Optional<id> id();

  Optional<Boolean> immutable();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> modifierExtension();

  static ImmutableValueSet.ResourceTypeBuildStage builder() {
    return ImmutableValueSet.builder();
  }
}
