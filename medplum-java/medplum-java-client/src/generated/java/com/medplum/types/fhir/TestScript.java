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
    as = ImmutableTestScript.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript {
  Optional<Boolean> experimental();

  Optional<Uri> url();

  Optional<String> title();

  Optional<TestScript_Teardown> teardown();

  Optional<DateTime> date();

  Optional<List<TestScript_Destination>> destination();

  Optional<List<TestScript_Test>> test();

  Optional<Markdown> description();

  Optional<TestScript_Setup> setup();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<UsageContext>> useContext();

  Optional<TestscriptStatus> status();

  Optional<List<TestScript_Fixture>> fixture();

  Optional<String> name();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Identifier> identifier();

  Optional<TestScript_Metadata> metadata();

  Optional<List<TestScript_Origin>> origin();

  Optional<List<Reference>> profile();

  Optional<String> version();

  Optional<List<TestScript_Variable>> variable();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<Markdown> copyright();

  Optional<Id> id();

  String resourceType();

  Optional<List<ContactDetail>> contact();

  static ImmutableTestScript.ResourceTypeBuildStage builder() {
    return ImmutableTestScript.builder();
  }
}
