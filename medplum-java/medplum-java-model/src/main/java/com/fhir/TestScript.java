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
    as = ImmutableTestScript.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript {
  Optional<dateTime> date();

  Optional<markdown> purpose();

  Optional<Identifier> identifier();

  Optional<TestScript_Setup> setup();

  Optional<TestScript_Metadata> metadata();

  Optional<List<TestScript_Fixture>> fixture();

  Optional<Meta> meta();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<TestScript_Teardown> teardown();

  Optional<code> language();

  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<List<Reference>> profile();

  Optional<uri> implicitRules();

  Optional<List<TestScript_Variable>> variable();

  Optional<String> version();

  Optional<markdown> description();

  Optional<String> name();

  Optional<List<TestScript_Test>> test();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<List<TestScript_Origin>> origin();

  Optional<Narrative> text();

  Optional<List<TestScript_Destination>> destination();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<TestscriptStatus> status();

  Optional<markdown> copyright();

  static ImmutableTestScript.ResourceTypeBuildStage builder() {
    return ImmutableTestScript.builder();
  }
}
