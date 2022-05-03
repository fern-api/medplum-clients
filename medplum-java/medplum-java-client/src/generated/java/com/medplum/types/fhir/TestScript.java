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
  Optional<Markdown> copyright();

  Optional<Markdown> purpose();

  Optional<TestScript_Teardown> teardown();

  Optional<TestScript_Metadata> metadata();

  Optional<DateTime> date();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Uri> url();

  Optional<Markdown> description();

  Optional<String> publisher();

  Optional<Code> language();

  Optional<TestScript_Setup> setup();

  Optional<List<TestScript_Variable>> variable();

  String resourceType();

  Optional<Boolean> experimental();

  Optional<String> version();

  Optional<List<TestScript_Origin>> origin();

  Optional<Identifier> identifier();

  Optional<List<TestScript_Fixture>> fixture();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<TestScript_Test>> test();

  Optional<String> name();

  Optional<List<Reference>> profile();

  Optional<TestscriptStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<List<TestScript_Destination>> destination();

  Optional<Meta> meta();

  static ImmutableTestScript.ResourceTypeBuildStage builder() {
    return ImmutableTestScript.builder();
  }
}
