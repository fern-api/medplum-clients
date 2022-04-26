package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link JsonWebKey}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJsonWebKey.builder()}.
 */
@Generated(from = "JsonWebKey", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJsonWebKey implements JsonWebKey {
  private final @Nullable String kid;
  private final @Nullable String d;
  private final @Nullable String use;
  private final @Nullable String kty;
  private final @Nullable Code language;
  private final @Nullable Boolean active;
  private final @Nullable String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable String alg;
  private final @Nullable String p;
  private final @Nullable String e;
  private final @Nullable String dq;
  private final @Nullable Id id;
  private final @Nullable List<String> x5c;
  private final @Nullable List<String> key_ops;
  private final @Nullable String n;
  private final @Nullable String x5t;
  private final @Nullable Uri implicitRules;
  private final @Nullable String q;
  private final @Nullable String dp;
  private final @Nullable String qi;

  private ImmutableJsonWebKey(
      @Nullable String kid,
      @Nullable String d,
      @Nullable String use,
      @Nullable String kty,
      @Nullable Code language,
      @Nullable Boolean active,
      @Nullable String resourceType,
      @Nullable Meta meta,
      @Nullable String alg,
      @Nullable String p,
      @Nullable String e,
      @Nullable String dq,
      @Nullable Id id,
      @Nullable List<String> x5c,
      @Nullable List<String> key_ops,
      @Nullable String n,
      @Nullable String x5t,
      @Nullable Uri implicitRules,
      @Nullable String q,
      @Nullable String dp,
      @Nullable String qi) {
    this.kid = kid;
    this.d = d;
    this.use = use;
    this.kty = kty;
    this.language = language;
    this.active = active;
    this.resourceType = resourceType;
    this.meta = meta;
    this.alg = alg;
    this.p = p;
    this.e = e;
    this.dq = dq;
    this.id = id;
    this.x5c = x5c;
    this.key_ops = key_ops;
    this.n = n;
    this.x5t = x5t;
    this.implicitRules = implicitRules;
    this.q = q;
    this.dp = dp;
    this.qi = qi;
  }

  /**
   * @return The value of the {@code kid} attribute
   */
  @JsonProperty("kid")
  @Override
  public Optional<String> kid() {
    return Optional.ofNullable(kid);
  }

  /**
   * @return The value of the {@code d} attribute
   */
  @JsonProperty("d")
  @Override
  public Optional<String> d() {
    return Optional.ofNullable(d);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<String> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code kty} attribute
   */
  @JsonProperty("kty")
  @Override
  public Optional<String> kty() {
    return Optional.ofNullable(kty);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code alg} attribute
   */
  @JsonProperty("alg")
  @Override
  public Optional<String> alg() {
    return Optional.ofNullable(alg);
  }

  /**
   * @return The value of the {@code p} attribute
   */
  @JsonProperty("p")
  @Override
  public Optional<String> p() {
    return Optional.ofNullable(p);
  }

  /**
   * @return The value of the {@code e} attribute
   */
  @JsonProperty("e")
  @Override
  public Optional<String> e() {
    return Optional.ofNullable(e);
  }

  /**
   * @return The value of the {@code dq} attribute
   */
  @JsonProperty("dq")
  @Override
  public Optional<String> dq() {
    return Optional.ofNullable(dq);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code x5c} attribute
   */
  @JsonProperty("x5c")
  @Override
  public Optional<List<String>> x5c() {
    return Optional.ofNullable(x5c);
  }

  /**
   * @return The value of the {@code key_ops} attribute
   */
  @JsonProperty("key_ops")
  @Override
  public Optional<List<String>> key_ops() {
    return Optional.ofNullable(key_ops);
  }

  /**
   * @return The value of the {@code n} attribute
   */
  @JsonProperty("n")
  @Override
  public Optional<String> n() {
    return Optional.ofNullable(n);
  }

  /**
   * @return The value of the {@code x5t} attribute
   */
  @JsonProperty("x5t")
  @Override
  public Optional<String> x5t() {
    return Optional.ofNullable(x5t);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code q} attribute
   */
  @JsonProperty("q")
  @Override
  public Optional<String> q() {
    return Optional.ofNullable(q);
  }

  /**
   * @return The value of the {@code dp} attribute
   */
  @JsonProperty("dp")
  @Override
  public Optional<String> dp() {
    return Optional.ofNullable(dp);
  }

  /**
   * @return The value of the {@code qi} attribute
   */
  @JsonProperty("qi")
  @Override
  public Optional<String> qi() {
    return Optional.ofNullable(qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#kid() kid} attribute.
   * @param value The value for kid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "kid");
    if (Objects.equals(this.kid, newValue)) return this;
    return new ImmutableJsonWebKey(
        newValue,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#kid() kid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.kid, value)) return this;
    return new ImmutableJsonWebKey(
        value,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#d() d} attribute.
   * @param value The value for d
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withD(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "d");
    if (Objects.equals(this.d, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        newValue,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#d() d} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for d
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withD(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.d, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        value,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withUse(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "use");
    if (Objects.equals(this.use, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        newValue,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#use() use} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withUse(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.use, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        value,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#kty() kty} attribute.
   * @param value The value for kty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKty(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "kty");
    if (Objects.equals(this.kty, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        newValue,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#kty() kty} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKty(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.kty, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        value,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        newValue,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        value,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        newValue,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        value,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        newValue,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        value,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        newValue,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        value,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#alg() alg} attribute.
   * @param value The value for alg
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withAlg(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "alg");
    if (Objects.equals(this.alg, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        newValue,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#alg() alg} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alg
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withAlg(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.alg, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        value,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#p() p} attribute.
   * @param value The value for p
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withP(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "p");
    if (Objects.equals(this.p, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        newValue,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#p() p} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for p
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withP(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.p, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        value,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#e() e} attribute.
   * @param value The value for e
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withE(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "e");
    if (Objects.equals(this.e, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        newValue,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#e() e} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for e
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withE(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.e, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        value,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#dq() dq} attribute.
   * @param value The value for dq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDq(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "dq");
    if (Objects.equals(this.dq, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        newValue,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#dq() dq} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDq(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.dq, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        value,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        newValue,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        value,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#x5c() x5c} attribute.
   * @param value The value for x5c
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5c(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "x5c");
    if (this.x5c == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        newValue,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#x5c() x5c} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for x5c
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withX5c(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.x5c == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        value,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#key_ops() key_ops} attribute.
   * @param value The value for key_ops
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withKey_ops(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "key_ops");
    if (this.key_ops == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        newValue,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#key_ops() key_ops} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for key_ops
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withKey_ops(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.key_ops == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        value,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#n() n} attribute.
   * @param value The value for n
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withN(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "n");
    if (Objects.equals(this.n, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        newValue,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#n() n} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for n
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withN(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.n, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        value,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#x5t() x5t} attribute.
   * @param value The value for x5t
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5t(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "x5t");
    if (Objects.equals(this.x5t, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        newValue,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#x5t() x5t} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for x5t
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withX5t(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.x5t, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        value,
        this.implicitRules,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        newValue,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableJsonWebKey withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        value,
        this.q,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#q() q} attribute.
   * @param value The value for q
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQ(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "q");
    if (Objects.equals(this.q, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        newValue,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#q() q} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for q
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQ(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.q, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        value,
        this.dp,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#dp() dp} attribute.
   * @param value The value for dp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDp(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "dp");
    if (Objects.equals(this.dp, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        newValue,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#dp() dp} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withDp(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.dp, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        value,
        this.qi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JsonWebKey#qi() qi} attribute.
   * @param value The value for qi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQi(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "qi");
    if (Objects.equals(this.qi, newValue)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JsonWebKey#qi() qi} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJsonWebKey withQi(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.qi, value)) return this;
    return new ImmutableJsonWebKey(
        this.kid,
        this.d,
        this.use,
        this.kty,
        this.language,
        this.active,
        this.resourceType,
        this.meta,
        this.alg,
        this.p,
        this.e,
        this.dq,
        this.id,
        this.x5c,
        this.key_ops,
        this.n,
        this.x5t,
        this.implicitRules,
        this.q,
        this.dp,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJsonWebKey} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJsonWebKey
        && equalTo((ImmutableJsonWebKey) another);
  }

  private boolean equalTo(ImmutableJsonWebKey another) {
    return Objects.equals(kid, another.kid)
        && Objects.equals(d, another.d)
        && Objects.equals(use, another.use)
        && Objects.equals(kty, another.kty)
        && Objects.equals(language, another.language)
        && Objects.equals(active, another.active)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(alg, another.alg)
        && Objects.equals(p, another.p)
        && Objects.equals(e, another.e)
        && Objects.equals(dq, another.dq)
        && Objects.equals(id, another.id)
        && Objects.equals(x5c, another.x5c)
        && Objects.equals(key_ops, another.key_ops)
        && Objects.equals(n, another.n)
        && Objects.equals(x5t, another.x5t)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(q, another.q)
        && Objects.equals(dp, another.dp)
        && Objects.equals(qi, another.qi);
  }

  /**
   * Computes a hash code from attributes: {@code kid}, {@code d}, {@code use}, {@code kty}, {@code language}, {@code active}, {@code resourceType}, {@code meta}, {@code alg}, {@code p}, {@code e}, {@code dq}, {@code id}, {@code x5c}, {@code key_ops}, {@code n}, {@code x5t}, {@code implicitRules}, {@code q}, {@code dp}, {@code qi}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(kid);
    h += (h << 5) + Objects.hashCode(d);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(kty);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(alg);
    h += (h << 5) + Objects.hashCode(p);
    h += (h << 5) + Objects.hashCode(e);
    h += (h << 5) + Objects.hashCode(dq);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(x5c);
    h += (h << 5) + Objects.hashCode(key_ops);
    h += (h << 5) + Objects.hashCode(n);
    h += (h << 5) + Objects.hashCode(x5t);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(q);
    h += (h << 5) + Objects.hashCode(dp);
    h += (h << 5) + Objects.hashCode(qi);
    return h;
  }

  /**
   * Prints the immutable value {@code JsonWebKey} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("JsonWebKey{");
    if (kid != null) {
      builder.append("kid=").append(kid);
    }
    if (d != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("d=").append(d);
    }
    if (use != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (kty != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("kty=").append(kty);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (active != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (resourceType != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (alg != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("alg=").append(alg);
    }
    if (p != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("p=").append(p);
    }
    if (e != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("e=").append(e);
    }
    if (dq != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("dq=").append(dq);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (x5c != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("x5c=").append(x5c);
    }
    if (key_ops != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("key_ops=").append(key_ops);
    }
    if (n != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("n=").append(n);
    }
    if (x5t != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("x5t=").append(x5t);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (q != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("q=").append(q);
    }
    if (dp != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("dp=").append(dp);
    }
    if (qi != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("qi=").append(qi);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "JsonWebKey", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements JsonWebKey {
    @Nullable Optional<String> kid = Optional.empty();
    boolean kidIsSet;
    @Nullable Optional<String> d = Optional.empty();
    boolean dIsSet;
    @Nullable Optional<String> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<String> kty = Optional.empty();
    boolean ktyIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> alg = Optional.empty();
    boolean algIsSet;
    @Nullable Optional<String> p = Optional.empty();
    boolean pIsSet;
    @Nullable Optional<String> e = Optional.empty();
    boolean eIsSet;
    @Nullable Optional<String> dq = Optional.empty();
    boolean dqIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<String>> x5c = Optional.empty();
    boolean x5cIsSet;
    @Nullable Optional<List<String>> key_ops = Optional.empty();
    boolean key_opsIsSet;
    @Nullable Optional<String> n = Optional.empty();
    boolean nIsSet;
    @Nullable Optional<String> x5t = Optional.empty();
    boolean x5tIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> q = Optional.empty();
    boolean qIsSet;
    @Nullable Optional<String> dp = Optional.empty();
    boolean dpIsSet;
    @Nullable Optional<String> qi = Optional.empty();
    boolean qiIsSet;
    @JsonProperty("kid")
    public void setKid(Optional<String> kid) {
      this.kid = kid;
      this.kidIsSet = true;
    }
    @JsonProperty("d")
    public void setD(Optional<String> d) {
      this.d = d;
      this.dIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<String> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("kty")
    public void setKty(Optional<String> kty) {
      this.kty = kty;
      this.ktyIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("alg")
    public void setAlg(Optional<String> alg) {
      this.alg = alg;
      this.algIsSet = true;
    }
    @JsonProperty("p")
    public void setP(Optional<String> p) {
      this.p = p;
      this.pIsSet = true;
    }
    @JsonProperty("e")
    public void setE(Optional<String> e) {
      this.e = e;
      this.eIsSet = true;
    }
    @JsonProperty("dq")
    public void setDq(Optional<String> dq) {
      this.dq = dq;
      this.dqIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("x5c")
    public void setX5c(Optional<List<String>> x5c) {
      this.x5c = x5c;
      this.x5cIsSet = true;
    }
    @JsonProperty("key_ops")
    public void setKey_ops(Optional<List<String>> key_ops) {
      this.key_ops = key_ops;
      this.key_opsIsSet = true;
    }
    @JsonProperty("n")
    public void setN(Optional<String> n) {
      this.n = n;
      this.nIsSet = true;
    }
    @JsonProperty("x5t")
    public void setX5t(Optional<String> x5t) {
      this.x5t = x5t;
      this.x5tIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("q")
    public void setQ(Optional<String> q) {
      this.q = q;
      this.qIsSet = true;
    }
    @JsonProperty("dp")
    public void setDp(Optional<String> dp) {
      this.dp = dp;
      this.dpIsSet = true;
    }
    @JsonProperty("qi")
    public void setQi(Optional<String> qi) {
      this.qi = qi;
      this.qiIsSet = true;
    }
    @Override
    public Optional<String> kid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> d() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> kty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> alg() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> p() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> e() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> dq() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> x5c() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> key_ops() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> n() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> x5t() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> q() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> dp() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> qi() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableJsonWebKey fromJson(Json json) {
    ImmutableJsonWebKey.Builder builder = ImmutableJsonWebKey.builder();
    if (json.kidIsSet) {
      builder.kid(json.kid);
    }
    if (json.dIsSet) {
      builder.d(json.d);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.ktyIsSet) {
      builder.kty(json.kty);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.algIsSet) {
      builder.alg(json.alg);
    }
    if (json.pIsSet) {
      builder.p(json.p);
    }
    if (json.eIsSet) {
      builder.e(json.e);
    }
    if (json.dqIsSet) {
      builder.dq(json.dq);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.x5cIsSet) {
      builder.x5c(json.x5c);
    }
    if (json.key_opsIsSet) {
      builder.key_ops(json.key_ops);
    }
    if (json.nIsSet) {
      builder.n(json.n);
    }
    if (json.x5tIsSet) {
      builder.x5t(json.x5t);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.qIsSet) {
      builder.q(json.q);
    }
    if (json.dpIsSet) {
      builder.dp(json.dp);
    }
    if (json.qiIsSet) {
      builder.qi(json.qi);
    }
    return (ImmutableJsonWebKey) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JsonWebKey} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JsonWebKey instance
   */
  public static JsonWebKey copyOf(JsonWebKey instance) {
    if (instance instanceof ImmutableJsonWebKey) {
      return (ImmutableJsonWebKey) instance;
    }
    return ImmutableJsonWebKey.builder()
        .kid(instance.kid())
        .d(instance.d())
        .use(instance.use())
        .kty(instance.kty())
        .language(instance.language())
        .active(instance.active())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .alg(instance.alg())
        .p(instance.p())
        .e(instance.e())
        .dq(instance.dq())
        .id(instance.id())
        .x5c(instance.x5c())
        .key_ops(instance.key_ops())
        .n(instance.n())
        .x5t(instance.x5t())
        .implicitRules(instance.implicitRules())
        .q(instance.q())
        .dp(instance.dp())
        .qi(instance.qi())
        .build();
  }

  /**
   * Creates a builder for {@link JsonWebKey JsonWebKey}.
   * <pre>
   * ImmutableJsonWebKey.builder()
   *    .kid(String) // optional {@link JsonWebKey#kid() kid}
   *    .d(String) // optional {@link JsonWebKey#d() d}
   *    .use(String) // optional {@link JsonWebKey#use() use}
   *    .kty(String) // optional {@link JsonWebKey#kty() kty}
   *    .language(com.fhir.types.fhir.Code) // optional {@link JsonWebKey#language() language}
   *    .active(Boolean) // optional {@link JsonWebKey#active() active}
   *    .resourceType(String) // optional {@link JsonWebKey#resourceType() resourceType}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link JsonWebKey#meta() meta}
   *    .alg(String) // optional {@link JsonWebKey#alg() alg}
   *    .p(String) // optional {@link JsonWebKey#p() p}
   *    .e(String) // optional {@link JsonWebKey#e() e}
   *    .dq(String) // optional {@link JsonWebKey#dq() dq}
   *    .id(com.fhir.types.fhir.Id) // optional {@link JsonWebKey#id() id}
   *    .x5c(List&amp;lt;String&amp;gt;) // optional {@link JsonWebKey#x5c() x5c}
   *    .key_ops(List&amp;lt;String&amp;gt;) // optional {@link JsonWebKey#key_ops() key_ops}
   *    .n(String) // optional {@link JsonWebKey#n() n}
   *    .x5t(String) // optional {@link JsonWebKey#x5t() x5t}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link JsonWebKey#implicitRules() implicitRules}
   *    .q(String) // optional {@link JsonWebKey#q() q}
   *    .dp(String) // optional {@link JsonWebKey#dp() dp}
   *    .qi(String) // optional {@link JsonWebKey#qi() qi}
   *    .build();
   * </pre>
   * @return A new JsonWebKey builder
   */
  public static ImmutableJsonWebKey.Builder builder() {
    return new ImmutableJsonWebKey.Builder();
  }

  /**
   * Builds instances of type {@link JsonWebKey JsonWebKey}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "JsonWebKey", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_KID = 0x1L;
    private static final long OPT_BIT_D = 0x2L;
    private static final long OPT_BIT_USE = 0x4L;
    private static final long OPT_BIT_KTY = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_ACTIVE = 0x20L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_ALG = 0x100L;
    private static final long OPT_BIT_P = 0x200L;
    private static final long OPT_BIT_E = 0x400L;
    private static final long OPT_BIT_DQ = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_X5C = 0x2000L;
    private static final long OPT_BIT_KEY_OPS = 0x4000L;
    private static final long OPT_BIT_N = 0x8000L;
    private static final long OPT_BIT_X5T = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_Q = 0x40000L;
    private static final long OPT_BIT_DP = 0x80000L;
    private static final long OPT_BIT_QI = 0x100000L;
    private long optBits;

    private @Nullable String kid;
    private @Nullable String d;
    private @Nullable String use;
    private @Nullable String kty;
    private @Nullable Code language;
    private @Nullable Boolean active;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable String alg;
    private @Nullable String p;
    private @Nullable String e;
    private @Nullable String dq;
    private @Nullable Id id;
    private @Nullable List<String> x5c;
    private @Nullable List<String> key_ops;
    private @Nullable String n;
    private @Nullable String x5t;
    private @Nullable Uri implicitRules;
    private @Nullable String q;
    private @Nullable String dp;
    private @Nullable String qi;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kid() kid} to kid.
     * @param kid The value for kid
     * @return {@code this} builder for chained invocation
     */
    public final Builder kid(String kid) {
      checkNotIsSet(kidIsSet(), "kid");
      this.kid = Objects.requireNonNull(kid, "kid");
      optBits |= OPT_BIT_KID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kid() kid} to kid.
     * @param kid The value for kid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kid")
    public final Builder kid(Optional<String> kid) {
      checkNotIsSet(kidIsSet(), "kid");
      this.kid = kid.orElse(null);
      optBits |= OPT_BIT_KID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#d() d} to d.
     * @param d The value for d
     * @return {@code this} builder for chained invocation
     */
    public final Builder d(String d) {
      checkNotIsSet(dIsSet(), "d");
      this.d = Objects.requireNonNull(d, "d");
      optBits |= OPT_BIT_D;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#d() d} to d.
     * @param d The value for d
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("d")
    public final Builder d(Optional<String> d) {
      checkNotIsSet(dIsSet(), "d");
      this.d = d.orElse(null);
      optBits |= OPT_BIT_D;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(String use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<String> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kty() kty} to kty.
     * @param kty The value for kty
     * @return {@code this} builder for chained invocation
     */
    public final Builder kty(String kty) {
      checkNotIsSet(ktyIsSet(), "kty");
      this.kty = Objects.requireNonNull(kty, "kty");
      optBits |= OPT_BIT_KTY;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#kty() kty} to kty.
     * @param kty The value for kty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kty")
    public final Builder kty(Optional<String> kty) {
      checkNotIsSet(ktyIsSet(), "kty");
      this.kty = kty.orElse(null);
      optBits |= OPT_BIT_KTY;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#alg() alg} to alg.
     * @param alg The value for alg
     * @return {@code this} builder for chained invocation
     */
    public final Builder alg(String alg) {
      checkNotIsSet(algIsSet(), "alg");
      this.alg = Objects.requireNonNull(alg, "alg");
      optBits |= OPT_BIT_ALG;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#alg() alg} to alg.
     * @param alg The value for alg
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alg")
    public final Builder alg(Optional<String> alg) {
      checkNotIsSet(algIsSet(), "alg");
      this.alg = alg.orElse(null);
      optBits |= OPT_BIT_ALG;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#p() p} to p.
     * @param p The value for p
     * @return {@code this} builder for chained invocation
     */
    public final Builder p(String p) {
      checkNotIsSet(pIsSet(), "p");
      this.p = Objects.requireNonNull(p, "p");
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#p() p} to p.
     * @param p The value for p
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("p")
    public final Builder p(Optional<String> p) {
      checkNotIsSet(pIsSet(), "p");
      this.p = p.orElse(null);
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#e() e} to e.
     * @param e The value for e
     * @return {@code this} builder for chained invocation
     */
    public final Builder e(String e) {
      checkNotIsSet(eIsSet(), "e");
      this.e = Objects.requireNonNull(e, "e");
      optBits |= OPT_BIT_E;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#e() e} to e.
     * @param e The value for e
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("e")
    public final Builder e(Optional<String> e) {
      checkNotIsSet(eIsSet(), "e");
      this.e = e.orElse(null);
      optBits |= OPT_BIT_E;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dq() dq} to dq.
     * @param dq The value for dq
     * @return {@code this} builder for chained invocation
     */
    public final Builder dq(String dq) {
      checkNotIsSet(dqIsSet(), "dq");
      this.dq = Objects.requireNonNull(dq, "dq");
      optBits |= OPT_BIT_DQ;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dq() dq} to dq.
     * @param dq The value for dq
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dq")
    public final Builder dq(Optional<String> dq) {
      checkNotIsSet(dqIsSet(), "dq");
      this.dq = dq.orElse(null);
      optBits |= OPT_BIT_DQ;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5c() x5c} to x5c.
     * @param x5c The value for x5c
     * @return {@code this} builder for chained invocation
     */
    public final Builder x5c(List<String> x5c) {
      checkNotIsSet(x5cIsSet(), "x5c");
      this.x5c = Objects.requireNonNull(x5c, "x5c");
      optBits |= OPT_BIT_X5C;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5c() x5c} to x5c.
     * @param x5c The value for x5c
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("x5c")
    public final Builder x5c(Optional<? extends List<String>> x5c) {
      checkNotIsSet(x5cIsSet(), "x5c");
      this.x5c = x5c.orElse(null);
      optBits |= OPT_BIT_X5C;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#key_ops() key_ops} to key_ops.
     * @param key_ops The value for key_ops
     * @return {@code this} builder for chained invocation
     */
    public final Builder key_ops(List<String> key_ops) {
      checkNotIsSet(key_opsIsSet(), "key_ops");
      this.key_ops = Objects.requireNonNull(key_ops, "key_ops");
      optBits |= OPT_BIT_KEY_OPS;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#key_ops() key_ops} to key_ops.
     * @param key_ops The value for key_ops
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key_ops")
    public final Builder key_ops(Optional<? extends List<String>> key_ops) {
      checkNotIsSet(key_opsIsSet(), "key_ops");
      this.key_ops = key_ops.orElse(null);
      optBits |= OPT_BIT_KEY_OPS;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#n() n} to n.
     * @param n The value for n
     * @return {@code this} builder for chained invocation
     */
    public final Builder n(String n) {
      checkNotIsSet(nIsSet(), "n");
      this.n = Objects.requireNonNull(n, "n");
      optBits |= OPT_BIT_N;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#n() n} to n.
     * @param n The value for n
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("n")
    public final Builder n(Optional<String> n) {
      checkNotIsSet(nIsSet(), "n");
      this.n = n.orElse(null);
      optBits |= OPT_BIT_N;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5t() x5t} to x5t.
     * @param x5t The value for x5t
     * @return {@code this} builder for chained invocation
     */
    public final Builder x5t(String x5t) {
      checkNotIsSet(x5tIsSet(), "x5t");
      this.x5t = Objects.requireNonNull(x5t, "x5t");
      optBits |= OPT_BIT_X5T;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#x5t() x5t} to x5t.
     * @param x5t The value for x5t
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("x5t")
    public final Builder x5t(Optional<String> x5t) {
      checkNotIsSet(x5tIsSet(), "x5t");
      this.x5t = x5t.orElse(null);
      optBits |= OPT_BIT_X5T;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#q() q} to q.
     * @param q The value for q
     * @return {@code this} builder for chained invocation
     */
    public final Builder q(String q) {
      checkNotIsSet(qIsSet(), "q");
      this.q = Objects.requireNonNull(q, "q");
      optBits |= OPT_BIT_Q;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#q() q} to q.
     * @param q The value for q
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("q")
    public final Builder q(Optional<String> q) {
      checkNotIsSet(qIsSet(), "q");
      this.q = q.orElse(null);
      optBits |= OPT_BIT_Q;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dp() dp} to dp.
     * @param dp The value for dp
     * @return {@code this} builder for chained invocation
     */
    public final Builder dp(String dp) {
      checkNotIsSet(dpIsSet(), "dp");
      this.dp = Objects.requireNonNull(dp, "dp");
      optBits |= OPT_BIT_DP;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#dp() dp} to dp.
     * @param dp The value for dp
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dp")
    public final Builder dp(Optional<String> dp) {
      checkNotIsSet(dpIsSet(), "dp");
      this.dp = dp.orElse(null);
      optBits |= OPT_BIT_DP;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#qi() qi} to qi.
     * @param qi The value for qi
     * @return {@code this} builder for chained invocation
     */
    public final Builder qi(String qi) {
      checkNotIsSet(qiIsSet(), "qi");
      this.qi = Objects.requireNonNull(qi, "qi");
      optBits |= OPT_BIT_QI;
      return this;
    }

    /**
     * Initializes the optional value {@link JsonWebKey#qi() qi} to qi.
     * @param qi The value for qi
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qi")
    public final Builder qi(Optional<String> qi) {
      checkNotIsSet(qiIsSet(), "qi");
      this.qi = qi.orElse(null);
      optBits |= OPT_BIT_QI;
      return this;
    }

    /**
     * Builds a new {@link JsonWebKey JsonWebKey}.
     * @return An immutable instance of JsonWebKey
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public JsonWebKey build() {
      return new ImmutableJsonWebKey(
          kid,
          d,
          use,
          kty,
          language,
          active,
          resourceType,
          meta,
          alg,
          p,
          e,
          dq,
          id,
          x5c,
          key_ops,
          n,
          x5t,
          implicitRules,
          q,
          dp,
          qi);
    }

    private boolean kidIsSet() {
      return (optBits & OPT_BIT_KID) != 0;
    }

    private boolean dIsSet() {
      return (optBits & OPT_BIT_D) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean ktyIsSet() {
      return (optBits & OPT_BIT_KTY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean algIsSet() {
      return (optBits & OPT_BIT_ALG) != 0;
    }

    private boolean pIsSet() {
      return (optBits & OPT_BIT_P) != 0;
    }

    private boolean eIsSet() {
      return (optBits & OPT_BIT_E) != 0;
    }

    private boolean dqIsSet() {
      return (optBits & OPT_BIT_DQ) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean x5cIsSet() {
      return (optBits & OPT_BIT_X5C) != 0;
    }

    private boolean key_opsIsSet() {
      return (optBits & OPT_BIT_KEY_OPS) != 0;
    }

    private boolean nIsSet() {
      return (optBits & OPT_BIT_N) != 0;
    }

    private boolean x5tIsSet() {
      return (optBits & OPT_BIT_X5T) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean qIsSet() {
      return (optBits & OPT_BIT_Q) != 0;
    }

    private boolean dpIsSet() {
      return (optBits & OPT_BIT_DP) != 0;
    }

    private boolean qiIsSet() {
      return (optBits & OPT_BIT_QI) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of JsonWebKey is strict, attribute is already set: ".concat(name));
    }
  }
}
