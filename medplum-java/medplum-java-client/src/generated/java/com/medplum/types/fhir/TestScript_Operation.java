package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Operation {
  Optional<String> description();

  Optional<Boolean> encodeRequestUrl();

  Optional<Id> targetId();

  Optional<Id> requestId();

  Optional<List<TestScript_RequestHeader>> requestHeader();

  Optional<Id> responseId();

  Optional<String> id();

  Optional<Code> accept();

  Optional<Integer> destination();

  Optional<Id> sourceId();

  Optional<Coding> type();

  Optional<String> url();

  Optional<Code> resource();

  Optional<String> label();

  Optional<Code> contentType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> params();

  Optional<Integer> origin();

  Optional<Testscript_operationMethod> method();

  static ImmutableTestScript_Operation.Builder builder() {
    return ImmutableTestScript_Operation.builder();
  }
}
